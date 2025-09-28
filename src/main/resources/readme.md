
openssl pkcs12 -export \
-in /etc/letsencrypt/live/myapifleetcompany.xyz/fullchain.pem \
-inkey /etc/letsencrypt/live/myapifleetcompany.xyz/privkey.pem \
-out /etc/letsencrypt/live/myapifleetcompany.xyz/keystore.p12 \
-name springbootssl \
-password pass:springbootssl