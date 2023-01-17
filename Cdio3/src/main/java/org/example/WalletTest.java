package org.example;
import org.junit.jupiter.api.Test;

public class WalletTest {



@Test

        void walletCanAddMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(50);
            auto.UpdateMoney();

        }

@Test
        void walletCanSubtractMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(-50);
            auto.UpdateMoney();

        }

@Test
        void walletCanStoreMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(50);
            auto.UpdateMoney();
            auto.setSquareMoney(50);
            auto.UpdateMoney();

        }
    }

