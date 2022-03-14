<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the web site, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'mycusto' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', '' );

/** Database hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '.1e_5(Lmf^]J~`^UR;I2~~+~JgC,N^U{o*rRYG>+g^T|]q?[v`08;N.w^o}/`#7g' );
define( 'SECURE_AUTH_KEY',  '0$-kFpVH&obj1X|9#o]i@+ah(p@&.AD8QUcV*A2mE3la.]C,]aBEl+mPuRrQBd >' );
define( 'LOGGED_IN_KEY',    'qSEPA*IZHbb!+>c82<Vv:ta;uhulxCf&K/fs-:iPSBPM<ncMWPL-XB8DHY.%f=GP' );
define( 'NONCE_KEY',        '*Z+z7R+[=EO|eXD1i9t#,j/gryh f8lY}#Xm=|g]jKA,8~ku^:mqb|iKocO%L:Rm' );
define( 'AUTH_SALT',        'xn~%@e0p.Ot;qwU g2ycNccam_.`AA@zvOjBam9O,JavTbyH|ZG):yb8VyCG1R$.' );
define( 'SECURE_AUTH_SALT', '=ecY>*[g:u;UQO/v^bItGIxl,IDGB~%8BTG<Zy`4QV0wZ6;Tyo=izqyI-ot<7{i*' );
define( 'LOGGED_IN_SALT',   '^,GYHx{}v9UVXILr-gts>;DNWYs}4gCV-vE:BLP,2G+I*D/9kGTy3fE.2s3`RnlR' );
define( 'NONCE_SALT',       '8Qjc-{w2)gkG+yb6pIl7d9 v]EZjw:#iXf3D)!0AI#fki@YO8,i^S.Jx>Db%Cy[t' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
