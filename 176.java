# Write your MySQL query statement below
# select max(salary) from Employee where <>(select max (salary) from Employee);
SELECT MAX(SALARY) AS SecondHighestSalary FROM EMPLOYEE WHERE SALARY <>(SELECT MAX(SALARY) FROM EMPLOYEE);
    
