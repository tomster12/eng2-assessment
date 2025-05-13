workspace {
    model {
        user = person "Customer"
        admin = person "Administrator"

        system = softwareSystem "Shopping System" {
            pm_microservice = container "Product Management Microservice" {
                pm_resources = component "Resources"
                pm_repos = component "Repositories"
                pm_domain = component "Domain Objects"
                pm_events = component "Events"

            }

            om_microservice = container "Order Management Microservice" {
                om_resources = component "Resources"
                om_repos = component "Repositories"
                om_domain  = component "Domain Objects"
                om_events = component "Events"
            }

            kafka = container "Kafka" "" "" kafka

            pm_db = container "Products DB" "" "MariaDB" database
            om_db = container "Orders DB" "" "MariaDB" database

            pm_swagger_ui = container "Product Management Swagger UI" "" "" webapp
            om_swagger_ui = container "Order Management Swagger UI" "" "" webapp
            kafka_ui = container "Kafka UI"  "" "" webapp
            db_ui = container "Adminer UI"  "" "" webapp
        }

        user -> pm_swagger_ui "Uses"
        user -> om_swagger_ui "Uses"
        admin -> kafka_ui "Monitors"
        admin -> db_ui "Uses"

        pm_swagger_ui -> pm_microservice "Interacts via HTTP"
        om_swagger_ui -> om_microservice "Interacts via HTTP"
        kafka_ui -> kafka "Manages"
        db_ui -> pm_db "Manages"
        db_ui -> om_db "Manages"

        pm_microservice -> kafka "Consumes"
        pm_microservice -> pm_db "Reads & Writes"
        om_microservice -> kafka "Publishes"
        om_microservice -> om_db "Reads & Writes"

        om_microservice -> pm_microservice "Queries"
        om_resources -> pm_resources "Queries"

        pm_swagger_ui -> pm_resources "Interfaces"
        pm_resources -> pm_repos "Read & Writes"
        pm_resources -> pm_events "Consumes"
        pm_resources -> pm_domain "Uses"
        pm_repos -> pm_domain "Uses"
        pm_repos -> pm_db "Read & Writes"
        pm_events -> kafka "Consumes"

        om_swagger_ui -> om_resources "Interfaces"
        om_resources -> om_repos "Read & Writes"
        om_resources -> om_events "Publishes"
        om_resources -> om_domain "Uses"
        om_repos -> om_domain "Uses"
        om_repos -> om_db "Read & Writes"
        om_events -> kafka "Publishes"
    }

    views {
        systemContext system {
            include *
        }

        container system {
            include *
        }

        component pm_microservice {
            include *
        }

        component om_microservice {
            include *
        }

        styles {
            element "kafka" {
                shape "Folder"
                background "#f78beb"
            }

            element "database" {
                shape "Cylinder"
                background "#6197c9"
            }

            element "webapp" {
                shape "WebBrowser"
                background "#e08f4c"
            }
        }
    }
}