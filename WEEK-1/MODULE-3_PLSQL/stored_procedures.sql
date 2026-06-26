-- scenario 1
DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END$$

DELIMITER ;

CALL ProcessMonthlyInterest();

-- scenario 2

DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept_name VARCHAR(50),
    IN bonus_percent DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept_name;
END$$

DELIMITER ;

CALL UpdateEmployeeBonus('IT', 10);


-- scenario 3

DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE balance DECIMAL(10,2);

    SELECT Balance
    INTO balance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF balance >= amount THEN
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAccount;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient Balance';
    END IF;
END$$

DELIMITER ;

CALL TransferFunds(101, 102, 5000);