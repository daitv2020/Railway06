DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE IF NOT EXISTS ThucTap;
USE ThucTap;

DROP TABLE IF EXISTS country;
CREATE TABLE IF NOT EXISTS country(
country_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
country_name	VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS location;
CREATE TABLE IF NOT EXISTS location(
location_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
street_address	VARCHAR(50) NOT NULL,
postal_code		INT UNSIGNED,
country_id		INT UNSIGNED,
FOREIGN KEY (country_id) REFERENCES country (country_id)
);


DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee(
employee_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
full_name		VARCHAR(50) NOT NULL,
email			VARCHAR(100) UNIQUE KEY,
location_id		INT UNSIGNED,
FOREIGN KEY (location_id) REFERENCES location (location_id)
);

-- insert db
INSERT INTO country	(country_name)
VALUES				('Vietnam'	),
					('Lao'		),
                    ('Campuchia');


INSERT INTO location	(street_address	, postal_code	, country_id)
VALUES					('Hanoi'		, 10000			, 1			),
						('Vien-Chan'	, 20000			, 2			),
						('Phnompenh'	, 30000			, 3			);


INSERT INTO employee	(full_name				, email					, location_id)
VALUES					('Nguyen Van Chien'		, 'chien@gmail.com'		, 1			),
						('Sakura'				, 'Sakura@gmail.com'	, 2			),
						('Linda'				, 'linda@gmail.com'		, 3			),
                        ('Van Minh'				, 'vanminh@gmail.com'	, 1			),
                        ('Li Li'				, 'nn03@gmail.com'		, 2			),
                        ('Linh Lee'				, 'linhlee@gmail.com'	, 2			),
                        ('Cham Cham'			, 'chamcham@gmail.com'	, 3			);
                        




-- Question 2: 
-- a) Lấy tất cả các nhân viên thuộc Việt nam

SELECT e.full_name, e.email, l.street_address, c.country_name	
FROM location l
JOIN employee e ON l.location_id = e.location_id
JOIN country c ON l.country_id = c.country_id
WHERE c.country_name = 'Vietnam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT  c.country_name	
FROM location l
JOIN employee e ON l.location_id = e.location_id
JOIN country c ON l.country_id = c.country_id
WHERE e.email = 'nn03@gmail.com';

-- Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.

SELECT c.country_name, COUNT(e.employee_id) AS SoLuongEmployee
FROM location l
JOIN employee e ON l.location_id = e.location_id
JOIN country c ON l.country_id = c.country_id
GROUP BY c.country_id;

SELECT street_address, COUNT(employee_id) AS SoLuongEmployee
FROM location 
JOIN employee  USING(location_id)
GROUP BY location_id;


-- Question 3: Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee

DROP TRIGGER IF EXISTS q_3;
DELIMITER $$
CREATE TRIGGER q_3
BEFORE INSERT ON employee
FOR EACH ROW
BEGIN
		IF NEW.c.country_id IN (
           SELECT c.country_id, COUNT(e.employee_id)
			FROM location l
			JOIN employee e ON l.location_id = e.location_id
			JOIN country c ON l.country_id = c.country_id
			GROUP BY c.country_id
            HAVING COUNT(e.employee_id)>= 10) THEN 
            SIGNAL SQLSTATE '10001'
			SET MESSAGE_TEXT = 'so luong employee qua nhieu';
		END IF;
END $$
DELIMITER ;


-- Question 4: Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
DROP TRIGGER IF EXISTS q_4;
DELIMITER $$
CREATE TRIGGER q_4
AFTER DELETE ON location
FOR EACH ROW
BEGIN
		DECLARE v_location_id INT UNSIGNED;
		SELECT location_id INTO v_location_id FROM location;
        DELETE FROM location WHERE location_id = v_location_id;
        UPDATE employee SET location_id = NULL WHERE location_id = v_location_id;
END $$
DELIMITER ;




