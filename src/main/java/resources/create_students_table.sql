create table if not exists students
(
    id         bigint primary key generated always as identity,
    first_name character varying(255),
    last_name character varying(255),
    patronymic character varying(255),
    date_of_birth date,
    gradesbook_number bigint
);