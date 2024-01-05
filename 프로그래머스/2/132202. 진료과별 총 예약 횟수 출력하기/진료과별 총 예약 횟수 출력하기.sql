-- 코드를 입력하세요
SELECT MCDP_CD as "진료과코드",
count(APNT_NO) as "5월예약건수"
from APPOINTMENT
where APNT_YMD like "2022-05-%"
group by MCDP_CD -- 진료과 코드 별로 묶기
order by 2 asc, 1 asc -- '5월예약횟수' 기준으로 오름차순 정렬, '진료코드' 기준으로 오름차순 정렬