CREATE OR REPLACE VIEW cash_year AS
(SELECT date_part('year',day)as year, cash, AVG(value)
	FROM public.cash
	GROUP BY cash,date_part('year',day));