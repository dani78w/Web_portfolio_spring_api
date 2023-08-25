package com.example.first.planetScale

import Proyecto
import com.fasterxml.jackson.databind.util.JSONPObject
import java.sql.Connection
import java.sql.DriverManager


class PlanetScale {

    fun connect(): Connection{

        Class.forName("com.mysql.cj.jdbc.Driver")
        val conn: Connection = DriverManager.getConnection(
            "jdbc:mysql://aws.connect.psdb.cloud/porfoliodb?sslMode=VERIFY_IDENTITY",
            "prtbagf60lr1ffg679iz",
            "pscale_pw_9NQdWlQvUV8txeA26qzCz4AzyCytIoWoYqpGEwNxXvB"
        )
        return conn
    }

    fun showTables(connection: Connection): MutableList<Proyecto> {
        var preparedStatement = connection.prepareStatement("Select * from proyectos order by id asc");
        var resultSet = preparedStatement.executeQuery();
        var contenido=mutableListOf<String>();

        var i = 0;

        var json= mutableListOf<JSONPObject>()
        var productos = mutableListOf<Proyecto>();
        while (resultSet.next()) {
                productos.add(Proyecto(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),))
            i++
        }



        resultSet.close();
        preparedStatement.close();
        return productos
    }
}
