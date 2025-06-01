import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAO {
    private static final String URL = "jdbc:sqlite:bank.db"; // Change if using other DB

    public boolean transferMoney(int fromAccountId, int toAccountId, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false); // Start transaction

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                // Debit from source account
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                int rowsDebited = debitStmt.executeUpdate();

                // Credit to destination account
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                int rowsCredited = creditStmt.executeUpdate();

                // Check both updates affected one row each
                if (rowsDebited == 1 && rowsCredited == 1) {
                    conn.commit();
                    System.out.println("Transaction successful: Transferred " + amount);
                    return true;
                } else {
                    conn.rollback();
                    System.out.println("Transaction failed: Account not found.");
                    return false;
                }
            } catch (SQLException e) {
                conn.rollback(); // Rollback on any error
                System.out.println("Transaction failed: " + e.getMessage());
                return false;
            } finally {
                conn.setAutoCommit(true); // Restore default
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
            return false;
        }
    }
}
