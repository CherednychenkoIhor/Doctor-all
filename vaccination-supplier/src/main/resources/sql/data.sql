USE vaccination_supplier;

INSERT INTO `vaccinations`
    (SELECT 1,
            'https://khoda.gov.ua/image/catalog/Anton/1205vaktsinats%D1%96ya.jpg',
            'Great Britain',
            'intramuscularly',
            'AstraZeneca',
            100 WHERE NOT EXISTS (SELECT * FROM `vaccinations` WHERE name = 'AstraZeneca'));
INSERT INTO `vaccinations`
    (SELECT 2,
            'https://gdb.voanews.com/3E8439CB-9EF0-48FF-90B2-A50E5CEE7760_w1080_h608.jpg',
            'USA',
            'intramuscularly',
            'Pfizer',
            200 WHERE NOT EXISTS (SELECT * FROM `vaccinations` WHERE name = 'Pfizer'));
INSERT INTO `vaccinations`
    (SELECT 3,
            'https://media.slovoidilo.ua/media/publications/14/135463/135463-1_large.jpg',
            'China',
            'intramuscularly',
            'CoronaVac',
            300 WHERE NOT EXISTS (SELECT * FROM `vaccinations` WHERE name = 'CoronaVac'));