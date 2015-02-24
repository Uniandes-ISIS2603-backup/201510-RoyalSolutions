(function () {
	var crud = angular.module('CrudModule');

	crud.factory('CRUDUtils', ['Restangular', function (RestAngular) {
			function CRUD($scope) {
				this.api = RestAngular.all(this.url);
				$scope.currentRecord = {};
				$scope.records = [];
				this.editMode = false;

				this.fetchRecords = function () {
					var self = this;
					this.api.getList().then(function (data) {
						$scope.records = data;
						$scope.currentRecord = {};
						self.editMode = false;
					});
				};
                                this.comparacion = function ( ) {
                                    var mayor = 0;
                                    var artista = "ninguno";
                                    for(var i = 0; i < $scope.records.length; i++)
                                    {
					if($scope.records[i].albums > mayor)
                                        {
                                            mayor = $scope.records[i].albums;
                                            artista = $scope.records[i].artist;
                                        }
                                    }
                                    document.getElementById("msj").innerHTML = "<div class=\"alert alert-success\"> <a href=\"#\" class=\"close\" data-dismiss=\"alert\">&times</a>El artista " + artista + " posee el mayor numero de albums, con " + mayor + " albums.</div>";;
				};
				this.createRecord = function () {
					this.editMode = true;
					$scope.currentRecord = {};
				};
				this.saveRecord = function () {
					var self = this;
					if ($scope.currentRecord.id) {
						$scope.currentRecord.put().then(function () {
							self.fetchRecords();
						});
					} else {
						this.api.post($scope.currentRecord).then(function () {
							self.fetchRecords();
						});
					}
				};
				this.deleteRecord = function (record) {
					var self = this;
					record.remove().then(function () {
						self.fetchRecords();
					});
				};
				this.editRecord = function (record) {
					$scope.currentRecord = RestAngular.copy(record);
					this.editMode = true;
				};
			}
			;
			return {
				extendCtrl: function (obj, scope) {
					CRUD.call(obj, scope);
				}
			};
		}]);
})();