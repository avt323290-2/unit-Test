### Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
***
#### <u>Вопрос 1</u>

Заглушки в тестах полезны, потому что они помогают изолировать код, который мы тестируем,
от других частей программы. Они позволяют нам сделать наше тестирование более предсказуемым
и легким в управлении, не требуя реальных служб или баз данных.

***
#### <u>Вопрос 2</u>

Если мы хотим проверить, что метод вызывается с определенными данными, мы используем
спайки (spies) или моки (mocks). Они позволяют нам "шпионить" за вызовами методов и
убедиться, что аргументы передаются правильно.

***
#### <u>Вопрос 3</u>
Если нам нужно, чтобы метод возвращал определенные значения или вызывал исключения,
мы используем моки (mocks) или стабы (stubs). Моки позволяют нам управлять поведением
метода и сказать ему, что вернуть или выбросить.

***
#### <u>Вопрос 4</u>
Для имитации взаимодействия с внешними системами, такими как внешние сервисы или базы
данных, мы используем заглушки для внешних ресурсов (external resource stubs) или
дублеры (doubles). Эти заглушки позволяют нам "подделать" ответы от этих систем,
чтобы наши тесты не зависели от реальных внешних ресурсов.