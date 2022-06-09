# Encapsulacion

Cuando un objeto se encuentra encapsulado , solo sus estados tiene acceso a sus atributos, evitando asi, la manipulacion de los atributos mediante la presencia de fuerzas externas, es decir, quien programa un objeto controla los metodos de acceso de sus estados y su comportamiento es decir.
Es una de las propiedades mas importantes de la POO.
consiste en la separacion de las propiedades externas de un objeto, correspondiente a la interfaz de sus funciones, de los detalles de implementacion interna del objeto.
Se reduce la complejidad del sistema protegiendo los objetos contra posibles errores, permitiendo lograr de mejor manera extensiones futuras en la implementacion de objetos.
Consiste basicamente en proteger los atributos del acceso directo de los objetos, colocandolos en una zona privada, y la unica forma de acceder a ellos es por medio de metodos que estan en la zona publica.

# Mensajes 

Una aplicacion orientada a objetos esta compuesta de varios objetos creadas desde su respectiva clase.
Estos objetos necesitan una forma de comunicarse, para intercambiar datos entre si, y lo hacen por medio de mensajes entre si, y lo hacen por medio de mensajes.
Los mensajes pueden contener parametros, en los cuales se indican las caracteristicas especificas de la accion a realizar.
Estructuralmente esta compuesto por los siguientes elementos:
1. objeto destino, hacia la cual el mensaje es enviado.
2. el metodo del nombre a llamar.
3. parametros solicitados por el metodo, a travez de la cual suele darse la informacion.

El envio y recepcion de los mensajes es simplemente una peticion de un objeto a otro objeto para que este se comporte de una manera determinada, ejecutando sus metodos.
Ejemplos
Si existe un objeto un objeto A de la clase carro y un objeto B de la clase impuesto, para calcular el 10% de impuestos sobre el precio del carro, la conicacion podria ser
`float costo = A.getPrecio();`
`B.calcularImpuesto(costo 0,10);`

# Ciclo de vida de los objetos
El objeto nace cuando se crea, vive cuando se utiliza en un programa y muere cuando deja de usarse.
Se llaman solo una vez al crear el objeto.
Tiene el mismo nombre de la clase.
Puede haber varios (sobre carga de metodos).
Al crear un objeto solo se utiliza uno.
No devuelve nada, ni void (realmente devuelve el objeto creado).

Inicializa los atributos del objeto al momento de crearse sin hacer otra instruccion adicional.
Java provee un constructor por defecto 
Tipos:
por defecto: no recibe parametros.
comun u ordinario: puede recibir toda clase parametros
de copia: permite la construccion de una copia del objeto.

# Crecimiento y vida del objeto
Una vez creado el objeto;
se puede trabajar con el
Llamar a los elementos de su clase
Guardar datos pra almacenar temporalmente antes de registrarlo en una BD.
Compartir datos con los demas objetos, pasandoles mensajes.
Cada objeto consume memoria, y depende los atributos que tenga 

# Muerte del objeto
Java utiliza el Gargabe collector para liberar los objetos no refenciados.
Java cuenta las referencias que hay sobre el objeto. El objeto se borra cuando no tenga refencias.
Antes de borrarlo Java da la oportunidad de limpiarse asi mismo; finalizacion.
Llamado explicito al gc System.get();

# Ejercicio 

Crear un programa para gestionar un plan de telefonia celular, el plan tiene un numero de celular, un operador, una cantidad de minutos y un costo por minuto.
Calcular el total a pagar teniendo en cuenta que si el operador es movilujo tiene un 50% de descuento. Usar minimo tres constructores