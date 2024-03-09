INSERT INTO [dbo].[users]
	(
      [username]
      ,[password]
      ,[email]
	)
VALUES
	('admin','adminpass','admin@gmail'),
	('user','userpass','user@gmail')

INSERT INTO .[dbo].[address]
	(
	  [user_id]
      ,[street]
      ,[city]
      ,[state]
      ,[postal_code]
	)
VALUES
	('1','lamlukka','lumlukka','lumlukka','1234'),
	('2','lamlukka','lumlukka','lumlukka','1234')
