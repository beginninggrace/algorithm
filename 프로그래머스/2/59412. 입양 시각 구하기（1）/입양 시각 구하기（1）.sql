-- 코드를 입력하세요
SELECT Extract(Hour from DATETIME) as hour, 
count (DATETIME) as count
from ANIMAL_OUTS 

where Extract(Hour from DATETIME) >=9 and Extract(Hour from DATETIME) < 20
group by Extract(Hour from DATETIME)
order by 1 

-- 혹은 다른 답안
SELECT substring(datetime,12,2) as hour,
count(*)
from animal_outs
where substring(datetime,12,2)  between 9 and 19
group by hour
order by hour
