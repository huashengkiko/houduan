DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);
CREATE TABLE IF NOT EXISTS smc_marketing_activity_connect(
    id varcahr(32) not null primary key,    mti_id varchar(255) not null ,    mai_id varchar(255) not null );
CREATE TABLE IF NOT EXISTS hospital_supplier(
    id int  not null primary key,    hospital varchar(255)  ,    supplier_id int   ,    status varchar(255)  ,    opinion varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    dr tinyint  ,    contract_name varchar(255)  ,    contract_code varchar(255)  ,    contract_attachment_url varchar(255)  ,    start_time datetime  ,    end_tiem datetime  );
CREATE TABLE IF NOT EXISTS suppplier_commodity(
    id varcahr(32) not null primary key,    commodity_id varchar(255)  ,    supplier_id varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    dr tinyint  );
CREATE TABLE IF NOT EXISTS article_content(
    id varcahr(32) not null primary key,    tenant_id varchar(255)  ,    article_id varchar(255)  ,    wechat_publist_no varchar(255)  ,    content varchar(255)  );
CREATE TABLE IF NOT EXISTS category(
    id varcahr(32) not null primary key,    name varchar(255) not null ,    description varchar(255)  ,    is_leaf tinyint  ,    parent_id varchar(255)  ,    wechat_publist_no varchar(255)  ,    tenant_id varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    dr tinyint  ,    ext1 varchar(255)  ,    ext2 varchar(255)  ,    ext3 varchar(255)  ,    ext4 varchar(255)  ,    ext_json varchar(255)  );
CREATE TABLE IF NOT EXISTS article_action_attribute(
    id varcahr(32) not null primary key,    wechat_publist_no varchar(255)  ,    article_id varchar(255)  ,    tenant_id varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_by varchar(255)  ,    updated_at datetime  ,    dr tinyint  ,    type varchar(255)  ,    number int   ,    ext1 varchar(255)  ,    ext2 varchar(255)  ,    ext3 varchar(255)  ,    ext4 varchar(255)  ,    ext_json varchar(255)  );
