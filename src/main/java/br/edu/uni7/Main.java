package br.edu.uni7;

import org.hsqldb.server.Server;

public class Main {
	public static void main(String... args) {
		Server.main(new String[]{"--database.0", "file:db/avaliacoes", "--dbname.0", "avaliacoes"});
	}
}
