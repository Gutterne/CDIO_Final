import org.example.Wallet;

public class WalletTest {




        void walletCanAddMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(50);
            auto.UpdateMoney();

        }


        void walletCanSubtractMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(-50);
            auto.UpdateMoney();

        }


        void walletCanStoreMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(50);
            auto.UpdateMoney();
            auto.setSquareMoney(50);
            auto.UpdateMoney();

        }
    }

