<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>DomoDoor</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
      <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
      <script src="/js/app.js"></script>
  </head>
  <body>
    <div class="container">
      <h1>Télécommande et gestion du portail</h1>
      <div class="row">
        <div class="col-lg-8">
            <img id="porteFermeeId" src="/img/fermee.jpg" alt="fermee" height="200" width="400">
            <img id="porteBloqueeId" src="/img/bloquee.jpg" alt="bloquee" height="200" width="400">
            <img id="porteOuverteId" src="/img/ouverte.jpg" alt="ouverte" height="200" width="400">
            <button id="boutonOuvrirPorteId" class="btn btn-default">Ouvrir porte</button>
            <button id="boutonFermerPorteId" class="btn btn-default">Fermer porte</button>
        </div>

        <div class="col-lg-3 col-lg-offset-1">
            <button id="boutonArretUrgenceId" class="btn btn-danger">Arrêt d'urgence</button>
            <button id="boutonRepriseId" class="btn btn-danger">Reprise clé</button>
        </div>
      </div>
    </div>

  </body>
</html>
