select U.name, sum(ifnull(R.distance, 0)) as travelled_distance 
from Users U left join Rides R on U.id = R.user_id 
group by U.id 
order by travelled_distance desc, U.name asc;
