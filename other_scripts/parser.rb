require 'open-uri'

def open_parse(url,i)
    f = open(url)
    a=f.readline.split(';')
    b=f.readline
    f.each_line do |line|
        for j in 1..37 do
            x=line.split(';')
            index=a[j].index(/[A-Z]/) 
            diver=a[j][0, index].to_i
            name=a[j][index,a[j].length]
            puts diver, name
            v=(x[j].gsub(/[,]/, '.').to_f/diver)  
            format = 'INSERT INTO public.cash(day, cash, value) VALUES ( \'%s\', \'%s\', %s);' % [x[0], name,v]
            puts format
            i.puts(format)
        end
    end 
end
File.open("data.sql", "w") do |i|
    open_parse('https://www.nbp.pl/kursy/Archiwum/archiwum_tab_a_2013.csv',i)
    open_parse('https://www.nbp.pl/kursy/Archiwum/archiwum_tab_a_2014.csv',i)
    open_parse('https://www.nbp.pl/kursy/Archiwum/archiwum_tab_a_2015.csv',i)
    open_parse('https://www.nbp.pl/kursy/Archiwum/archiwum_tab_a_2016.csv',i)
    open_parse('https://www.nbp.pl/kursy/Archiwum/archiwum_tab_a_2017.csv',i)
end