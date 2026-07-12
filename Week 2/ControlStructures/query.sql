-- Scenario 1
DECLARE
    CURSOR cust_cur IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR cust_rec IN cust_cur LOOP
        IF cust_rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Scenario 2
DECLARE
    CURSOR cust_cur IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR cust_rec IN cust_cur LOOP
        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 3
SET SERVEROUTPUT ON;

DECLARE
    CURSOR loan_cur IS
        SELECT CustomerID, LoanID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec IN loan_cur LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ' || loan_rec.CustomerID ||
            ' has Loan ' || loan_rec.LoanID ||
            ' due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/