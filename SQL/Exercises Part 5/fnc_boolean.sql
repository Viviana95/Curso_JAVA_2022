CREATE DEFINER=`root`@`localhost` FUNCTION `fnc_boolean` (p1 boolean , p2 varchar(5), p3 varchar(5)) RETURNS VARCHAR(5)  charset utf8mb4
BEGIN
IF p1=true then return p2;
else  return p3;
END IF;
RETURN 1;
END