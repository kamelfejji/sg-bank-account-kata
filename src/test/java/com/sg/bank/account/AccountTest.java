package com.sg.bank.account;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @InjectMocks
    private Account account;

    @Test
    public void should_add_deposit_amount() {
        //Given
        BigDecimal initialBalance = account.getBalance();
        BigDecimal depositAmount = BigDecimal.valueOf(200);

        //When
        account.deposit(depositAmount);

        //Then
        assertEquals(initialBalance.add(depositAmount), account.getBalance());
    }

}