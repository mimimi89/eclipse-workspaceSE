DROP TABLE sawon CASCADE CONSTRAINTS;
DROP TABLE depart CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: depart */
/**********************************/
CREATE TABLE depart(
		deptno                        		NUMBER(10)		 NULL ,
		dname                         		VARCHAR2(30)		 NULL ,
		no                            		NUMBER(10)		 NULL 
);

COMMENT ON TABLE depart is 'depart';
COMMENT ON COLUMN depart.deptno is 'deptno';
COMMENT ON COLUMN depart.dname is 'dname';
COMMENT ON COLUMN depart.no  is 'no';


/**********************************/
/* Table Name: sawon */
/**********************************/
CREATE TABLE sawon(
		no                            		NUMBER(10)		 NULL ,
		name                          		VARCHAR2(100)		 NOT NULL,
		deptno                        		INTEGER(10)		 NULL 
);

COMMENT ON TABLE sawon is 'sawon';
COMMENT ON COLUMN sawon.no  is 'no';
COMMENT ON COLUMN sawon.name is 'name';
COMMENT ON COLUMN sawon.deptno is 'deptno';



ALTER TABLE depart ADD CONSTRAINT IDX_depart_PK PRIMARY KEY (deptno);

ALTER TABLE sawon ADD CONSTRAINT IDX_sawon_PK PRIMARY KEY (no );
ALTER TABLE sawon ADD CONSTRAINT IDX_sawon_FK0 FOREIGN KEY (deptno) REFERENCES depart (deptno);

