CREATE FUNCTION `fnc_sum` (a integer , b integer)
RETURNS INTEGER
BEGIN
declare result integer;
set result = a+b;
RETURN result;
END;