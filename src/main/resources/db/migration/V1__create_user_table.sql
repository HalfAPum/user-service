CREATE TABLE Users(
    id int generated by default as identity primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255),
    password varchar(255),
    role varchar(255),
    status varchar(255),
    UNIQUE (email)
);