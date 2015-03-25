/**
 * Created by yevhen.tsyba on 3/25/2015.
 */
package sql_basic.service_registration;

/*
    Users added to registered on server MySQL DB.
    If user was deleted from service, time of deletion appears
    in correspond table row.
    It can be possible to repeat use same login in case
     there no same active login in the table.

     CREATE TABLE users (
        user_id BIGINT NOT NULL,
        login VARCHAR(40) NOT NULL,
        created_time TIMESTAMP NOT NULL DEFAULT NOW(),
        removed_time TIMESTAMP NULL DEFAULT NULL,
        state INT NOT NULL,

        PRIMARY KEY (user_id)
     );

     Write SQL query to select active logins (state field == 1)
     and adds column `removed_duplicates` with number of users
     with same non-active logins (state field == 2)
 */