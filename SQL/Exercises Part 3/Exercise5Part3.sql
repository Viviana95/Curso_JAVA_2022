USE capgemini_arg;

SELECT  dep.DEPARTMENT_NAME, loc.CITY
FROM  departments dep
RIGHT OUTER JOIN locations LOC ON dep.LOCATION_ID = loc.LOCATION_ID
