package com.example.ouroboros.model

class TableCodes {

    class PublicationTypeCodes {
        companion object {
            const val POST_REQUESTED = -1
            const val POST = 0
            const val REQUEST = 1
        }
    }

    class PublicationTypeStrings {
        companion object {
            val PUBLICATION_STRING : List<String>  = listOf(
                "POST",
                "REQUEST"
            )
        }
    }

    class RoleTypeCodes {
        companion object {
            const val UNKNOWN_ROLE = -1
            const val HELPER = 0
            const val APPLICANT = 1
        }
    }


    class CouplingStateCodes {
        companion object {
            const val ENABLE = 0
            const val DISABLE = 1
            const val WAITING = 2
        }
    }

    class RoleTypeStrings {
        companion object {
            val ROLE_STRING : List<String>  = listOf(
                "HELPER",
                "APPLICANT",
                "UNKNOWN_ROLE"
            )
        }
    }

    class OuroborosTypeStrings {
        companion object {
            val OUROBOROS_STRING : List<String>  = listOf(
                "Ouroboros Offering",
                "Ouroboros Load",
                "Ouroboros"
            )
        }
    }

    class DispatcherRoleTypeStrings {
        companion object {
            val DISPATCHER_ROLE_STRING : List<String>  = listOf(
                "HELPER (You)",
                "APPLICANT (You)",
                "UNKNOWN_ROLE (You)"
            )
        }
    }

    class ResourceCategoryCodes {
        companion object {
            const val INDOOR = 0
            const val OUTDOOR = 1
        }
    }

    class ResourceCategoryStrings {
        companion object {
            val CATEGORY_STRING : List<String> = listOf(
                "INDOOR",
                "OUTDOOR"
            )
        }
    }

    class ColorRoleCodes {
        companion object {
            val ROLE_COLORS : List<String> = listOf(
                "#ff669900",
                "#ffcc0000"
            )
        }
    }

    class OuroborosCodes {
        companion object{
            const val OUROBOROS_INIT = 0.0
        }
    }

    class ColorOuroborosCodes {
        companion object {
            const val NEGATIVE_COLOR = "#ffcc0000"
            const val NEUTRAL_COLOR = "#33999999"
            const val POSITIVE_COLOR = "#ff669900"
        }
    }

    class RoomCodes {
        companion object {
            const val ROOM_ALPHA = 0.33F
        }
    }

    class TableCodes {
        companion object {
            const val TOPIC_TABLE_CODE = "topics"
            const val USER_TABLE_CODE = "users"
            const val COUPLING_TABLE_CODE = "couplings"
            const val INTERACTION_TABLE_CODE = "interactions"
        }
    }

    class IntentCodes {
        companion object {
            const val MAP_REQUEST_CODE = "map_request_code"
            const val ROLE_TYPE_REQUEST_CODE = "role_type_request_code"
            const val TOPIC_SERIALIZABLE_CODE = "topic_serializable"
            const val COUPLING_SERIALIZABLE_CODE = "coupling_serializable"
            const val LOCATION_SERIALIZABLE_CODE = "location_serializable"
            const val MY_ID_TOPIC_CODE = "my_id_topic_code"
        }
    }



}
