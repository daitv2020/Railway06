-- Tạo DB
DROP DATABASE IF EXISTS Testing_exam_1;
CREATE DATABASE IF NOT EXISTS Testing_exam_1;
USE Testing_exam_1;

DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
customer_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
`name`				NVARCHAR(100),
phone				INT UNSIGNED,
email				VARCHAR(100) UNIQUE,
address				VARCHAR(200),
note				TEXT
);

DROP TABLE IF EXISTS car;
CREATE TABLE IF NOT EXISTS car (
car_id		TINYINT UNSIGNED PRIMARY KEY,
maker		ENUM('HONDA','TOYOTA','NISSAN'),
model		VARCHAR(100),
`year`		SMALLINT UNSIGNED,
color		VARCHAR(50),
note		TEXT
 );

DROP TABLE IF EXISTS car_order;
CREATE TABLE IF NOT EXISTS car_order (
order_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
customer_id			SMALLINT UNSIGNED,
car_id				TINYINT UNSIGNED,
amount				INT UNSIGNED DEFAULT 1,
sale_price			INT UNSIGNED,
order_date			DATE,
delivery_date		DATE,
delivery_address	VARCHAR (200),
`status`			ENUM('0','1','2') DEFAULT '0',
note				TEXT,
FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
FOREIGN KEY (car_id) REFERENCES car (car_id) 
);



INSERT INTO customer	(`name`			, phone				, email						, address			, note		)
VALUES					('khach hang 1'	, 0987654321		, 'khachhang1@gmail.com'	, 'address 1'		, 'note 1'	),
						('khach hang 2'	, 0987654322		, 'khachhang2@gmail.com'	, 'address 2'		, 'note 1'	),
                        ('khach hang 3'	, 0987654323		, 'khachhang3@gmail.com'	, 'address 3'		, 'note 1'	),
                        ('khach hang 4'	, 0987654324		, 'khachhang4@gmail.com'	, 'address 4'		, 'note 1'	),
                        ('khach hang 5'	, 0987654325		, 'khachhang5@gmail.com'	, 'address 5'		, 'note 1'	);
	

INSERT INTO car		(car_id	, maker				, model			, `year`		, color		, note		)
VALUES				(	1	, 'TOYOTA'			, 'C1'			, 1995		, 'red'		, 'note 2' ),
					(	2	, 'NISSAN'			, 'B1'			, 1995		, 'red'		, 'note 2' ),
                    (	3	, 'TOYOTA'			, 'M1'			, 1995		, 'red'		, 'note 2' ),
                    (	4	, 'HONDA'			, 'A1'			, 1995		, 'red'		, 'note 2' ),
                    (	5	, 'HONDA'			, 'M3'			, 1995		, 'red'		, 'note 2' );
					

INSERT INTO car_order	(customer_id	, car_id	, amount	, sale_price	, order_date	, delivery_date	, delivery_address	, `status`	, note		)
VALUES					(1				, 1			, 1			, 500			, '2010-10-12'	, '2010-11-12'	, 'address 2'		,	'2'		, 'note 3'),
						(2				, 2			, 1			, 800			, '2020-01-12'	, '2020-02-12'	, 'address 4'		,	'0'		, 'note 3'),
                        (3				, 4			, 1			, 600			, '2019-10-12'	, '2019-11-12'	, 'address 5'		,	'0'		, 'note 3'),
                        (5				, 4			, 2			, 500			, '2020-10-12'	, '2020-11-12'	, 'address 1'		,	'1'		, 'note 3'),
                        (3				, 3			, 1			, 1000			, '2020-10-10'	, '2020-11-12'	, 'address 3'		,	'1'		, 'note 3');
                        
                        
                       
-- Question 2
SELECT c.customer_id,c.name, SUM(co.amount)
FROM customer c
LEFT JOIN car_order co ON c.customer_id = co.customer_id
WHERE co.status = '1' OR co.status = '0'
GROUP BY co.customer_id
ORDER BY SUM(co.amount);
       
-- Question 3
DROP FUNCTION IF EXISTS Max_car_of_2020;
DELIMITER $$
CREATE FUNCTION Max_car_of_2020() RETURNS VARCHAR(100)
BEGIN
 DECLARE ten_hang  VARCHAR(100);
    DECLARE Car_ID_1  INT;
    SELECT  Car_ID,Maker INTO Car_ID_1,ten_hang
 FROM  car_order
    JOIN car USING (Car_ID)
    WHERE year(Order_Date) = 2020
    GROUP BY Maker
    ORDER BY SUM(Amount) DESC
    LIMIT 1;
    RETURN ten_hang;
END$$
DELIMITER ;
SELECT Max_car_of_2020();
SET GLOBAL log_bin_trust_function_creators = 1;



					
                    
-- Question 4
DROP PROCEDURE IF EXISTS q_4;
DELIMITER $$
CREATE PROCEDURE q_4()
BEGIN
	DELETE
	FROM car_order
	WHERE `status` = '2' && YEAR(order_date) < YEAR(NOW());
    SELECT ROW_COUNT();
END $$
DELIMITER ;

call testing_exam_1.q_4();

-- Question 5
DROP PROCEDURE IF EXISTS q_5;
DELIMITER $$
CREATE PROCEDURE q_5(IN in_customer_id INT UNSIGNED)
BEGIN
	SELECT c.`name`, co.order_id, ca.maker, COUNT(co.amount)
	FROM car_order co
    JOIN customer c ON co.customer_id = c.customer_id
    JOIN car ca ON co.car_id = ca.car_id
    WHERE co.`status` = '0' AND c.customer_id = in_customer_id
    GROUP BY ca.car_id ;
END $$
DELIMITER ;
call testing_exam_1.q_5(2);

-- Question 6
DROP TRIGGER IF EXISTS q_6;
DELIMITER $$
CREATE TRIGGER q_6
BEFORE INSERT ON car_order
FOR EACH ROW
BEGIN
	IF NEW.delivery_date < (NEW.order_date + 15) THEN
    SIGNAL SQLSTATE '10001'
    SET MESSAGE_TEXT =  ' loi nhap ngay ';
    END IF;
END $$
DELIMITER ;

    

                        