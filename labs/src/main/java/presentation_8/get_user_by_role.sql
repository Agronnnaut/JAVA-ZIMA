select u.id, u.username, r.title
from Users u
join users_roles ur on ur.userId = u.id
join Roles r on r.id = ur.id
where r.title = "Guest"
