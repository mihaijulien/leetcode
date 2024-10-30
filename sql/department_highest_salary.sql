select D.name as Department, E.name as Employee, E.salary
from Employee E join Department D 
on E.departmentId = D.id 
where E.salary = (select max(salary) from Employee where departmentId = D.id)