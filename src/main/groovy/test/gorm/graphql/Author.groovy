package test.gorm.graphql

import grails.gorm.annotation.Entity

@Entity
class Author {

    String name

    static graphql = true
}
