CREATE TABLE public.cash_index(
  id SERIAL,
  day TIMESTAMP,
  cash VARCHAR(50),
  value DOUBLE PRECISION
);

CREATE INDEX cash_index_idx ON public.cash_index(cash);
INSERT INTO public.cash_index(id, day, cash, value)
  SELECT id, day, cash, value FROM public.cash;