angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8001/university/api/v1';

    $scope.showPage = function (pageIndex = 1) {
        $http({
            url: contextPath + '/students',
            method: 'GET',
            params: {
                'p': pageIndex
            }
        }).then(function (response) {
            $scope.studentsPage = response.data;
            $scope.navList = $scope.generatePagesIndexes(1, $scope.studentsPage.totalPages);
            console.log(response.data);
        });
    };

    $scope.generatePagesIndexes = function (startPage, endPage) {
        let arr = [];
        for (let i = startPage; i < endPage + 1; i++) {
            arr.push(i);
        }
        return arr;
    }

    $scope.showPage();
});