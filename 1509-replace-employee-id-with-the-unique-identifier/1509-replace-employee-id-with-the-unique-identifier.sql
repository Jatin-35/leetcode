/* Write your PL/SQL query statement below */

select unique_id , name
from Employees  e left join EmployeeUNI  uni
on e.id = uni.id;