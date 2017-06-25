$(document).ready(function() {
    var porterFermee = $('#porteFermeeId');
    var porterOuverte = $('#porteOuverteId');
    var porterBloquee = $('#porteBloqueeId');
    var boutonArreturgence = $('#boutonArretUrgenceId');
    var boutonFermerPorte = $('#boutonFermerPorteId');
    var boutonOuvrirPorte = $('#boutonOuvrirPorteId');

    $.ajax({
        url: "/api/getEtatPorte",
        success: function(result) {

        }
    });
});