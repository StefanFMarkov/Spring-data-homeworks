package entities.bill_system;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "bank_account")
public class BankAccount extends BaseEntity {
    private String name;
    private String swiftCode;

    public BankAccount() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "swift_code")
    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

}
