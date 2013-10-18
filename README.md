timeloggerNoICE
===============

Installazione:
 * Importare la root di questa repo come progetto Eclipse
 * Installare ed avviare MySQL su localhost:3306
 * Creare un utente "root" MySQL senza password
 * Creare un database timelogger e concedere tutti i diritti a root@localhost su quel database
 * Eseguire come applicazione java la classe ormsamples.CreateTimeLoggerDatabaseSchema
 * Eseguire come applicazione java la classe ormsamples.CreateTimeLoggerData
 * Avviare l'applicazione eseguendo la classe main

Utenti creati all'avvio:
 * 1 utente di classe Administrator con credenziali "admin" , "a"
 * 1 utente di classe Manager con credenziali "manager", "m"
 * 4 utenti di classe Consulente con credenziali "cons[i]" , "c" ove [i] è l'indice dell'i-esimo consulente
