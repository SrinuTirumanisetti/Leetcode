CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare M INT;
    set M=N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from Employee 
      Order by salary DESC
      LIMIT 1
      OFFSET M
  );
END