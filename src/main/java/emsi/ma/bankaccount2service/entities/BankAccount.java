package emsi.ma.bankaccount2service.entities;

import emsi.ma.bankaccount2service.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class BankAccount {
    @Id
    private String id;
    private Date createdate;
    private Double balance;
    private String currency;
    private AccountType type;
}
