create or replace view items_readeds as
select items.title, count(loans.id) as qtde
from loans
inner join items on loans.item_id = items.id
where loans.devolution is not null
group by items.title
order by qtde desc
limit 10;

create or replace view more_readers as
select readers.name, count(loans.id) as qtde
from loans
inner join readers on loans.reader_id = readers.id
where loans.devolution is not null
group by readers.name
order by qtde desc
limit 10;
