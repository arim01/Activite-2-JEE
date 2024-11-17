package emsi.ma.bankaccount2service.service;

import emsi.ma.bankaccount2service.BankAccount2ServiceApplication;
import emsi.ma.bankaccount2service.dto.BankAccountRequestDTO;
import emsi.ma.bankaccount2service.dto.BankAccountResponseDTO;
import emsi.ma.bankaccount2service.entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
