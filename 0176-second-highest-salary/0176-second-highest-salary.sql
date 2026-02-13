# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary
FROM Employee
where salary<(
    Select MAX(salary) 
    FROM Employee
);