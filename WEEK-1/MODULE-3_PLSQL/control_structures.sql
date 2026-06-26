create database plsqllearn;

use plsqllearn;

CREATE TABLE Customers (
    CustomerID int PRIMARY KEY,
    Name VARCHAR(50),
    Age Int
);

CREATE TABLE Loans (
    LoanID int PRIMARY KEY,
    CustomerID int,
    InterestRate decimal(5,2),
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (101, 'John', 65);
INSERT INTO Customers VALUES (102, 'Alice', 45);
INSERT INTO Customers VALUES (103, 'Robert', 72);
INSERT INTO Customers VALUES (104, 'Emma', 58);
INSERT INTO Customers VALUES (105, 'David', 61);

COMMIT;

INSERT INTO Loans VALUES (1001, 101, 9.50, DATE '2026-07-15');
INSERT INTO Loans VALUES (1002, 102, 10.00, DATE '2026-08-10');
INSERT INTO Loans VALUES (1003, 103, 8.75, DATE '2026-07-20');
INSERT INTO Loans VALUES (1004, 104, 11.25, DATE '2026-09-05');
INSERT INTO Loans VALUES (1005, 105, 9.00, DATE '2026-07-30');

COMMIT;

select * from customers;
select * from Loans;

-- scenario 1
UPDATE Loans l
JOIN Customers c
ON l.CustomerID = c.CustomerID
SET l.InterestRate = l.InterestRate - 1
WHERE c.Age > 60;

-- scenario 2

UPDATE Customers c
JOIN Accounts a
ON c.CustomerID = a.CustomerID
SET c.IsVIP = TRUE
WHERE a.Balance > 10000;

-- scenario 3

SELECT
    c.Name,
    l.LoanID,
    l.DueDate,
    CONCAT('Reminder: Dear ', c.Name,
           ', your Loan ID ', l.LoanID,
           ' is due on ', l.DueDate) AS Reminder
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.DueDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);