# maintainable-code
training from CJ

#Server
runs on localhost:8080

#Endpoints

1. /hello?target={target} -> "Hello, $target!"
2. /add?left={left}&right={right} -> "$left + $right = ${left+right}"

#build
`mvn package`

#test
`mvn test`

#run
`mvn jetty:run-war`