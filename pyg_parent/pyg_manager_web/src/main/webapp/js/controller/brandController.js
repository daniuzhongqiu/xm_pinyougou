app.controller('brandController', function ($scope, $controller, brandService) {

    $controller('baseController', {$scope:$scope});

    //查询商品
    $scope.findAll = function () {
        alert(123)
        brandService.find().success(
            function (response) {
                $scope.list = response;
            }
        )
    }


    //分页显示
    $scope.findPage = function () {
        brandService.findPage($scope.paginationConf.itemsPerPage, $scope.paginationConf.currentPage).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;
            }
        )
    }

    //数据回显
    $scope.findOne = function (id) {
        brandService.findOne(id).success (
            function (response) {
                $scope.entity = response;
            })
    }

    //保存（包含新增和修改的一部分）
    $scope.save = function () {
        if ($scope.entity.id == null) {
            brandService.add($scope.entity).success(
                function (response) {
                    if(response.success){
                        $scope.findPage();
                    }else {
                        alert(response.message)
                    }
                }
            )
        }else{
            brandService.update($scope.entity).success(
                function (response) {
                    if (response.success) {
                        $scope.findPage();
                    }else {
                        alert(response.message)
                    }
                }
            )
        }
    }


    //删除批量删除
    $scope.del = function () {
        brandService.delete($scope.selectIds).success (
            function (response) {
                if (response.success) {
                    $scope.findPage();
                }else {
                    alert(response.message);
                }
            }
        )
    }

    $scope.xiao = function (id) {
        if ($scope.selectIds.indexOf(id) == -1) {
            return false;
        }
        return true;
    }
    $scope.searchEntity = {};

    //模糊查询
    $scope.search = function () {
        //alert(123);
        brandService.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage, $scope.searchEntity).success(
            function(response) {
                //alert(response.rows);
                //alert(response.total);
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;
            }
        )
    }
})