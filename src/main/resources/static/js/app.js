
var appTransferencia = angular.module('appTransferencia', ['ngMask']).

controller('transferenciaController', function ($scope, $http) {

    $scope.transferencias = [];
    $scope.transferencia={};
    $scope.retornoNovaTransferencia={};
    $scope.listaTipoTaxa={};



    $scope.listarTransferencia = function() {
        $http.get("/transferencia/listar/").success(function(data, status) {
            $scope.transferencias = data.transferencias;
        });
    };

    $scope.listarTipoTaxa = function() {
        $http.get("/transferencia/listarTipoTaxa/").success(function(data, status) {
            $scope.listaTipoTaxa = data.tipoTaxas;
        });
    };

    $scope.novaTransferencia = function(transferencia) {

        transferencia.dataTransferencia = convertDate(transferencia.dataTransferencia);

        console.log(transferencia.dataTransferencia);
        $http.post("/transferencia/nova/",transferencia).
         success(function(data, status) {
            $scope.retornoNovaTransferencia = data;
            $scope.limpar();
            $scope.listarTransferencia();
        }).error(function (data) {
            $scope.retornoNovaTransferencia.mensagem="Dados inválidos tente novamente"
        })
    };

    $scope.limpar = function () {
        $scope.transferencias = [];
        $scope.transferencia={};
        $scope.retornoNovaTransferencia={};
    };


    var convertDate = function(usDate) {
        var dateParts = usDate.split(/(\d{1,2})\/(\d{1,2})\/(\d{4})/);
        return dateParts[3] + "-" + dateParts[1] + "-" + dateParts[2];
    }


    $scope.listarTipoTaxa();
    $scope.listarTransferencia();


});