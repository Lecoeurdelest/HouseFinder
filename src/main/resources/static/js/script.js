$(document).ready(function () {
    $('#formDeposit').validate({
        rules: {
            phone: {
                required: true,
                number: true,
                minlength: 10,
                maxlength: 10
            },
            moveInDate: {
                required: true,
            }
        },
        messages: {
            phone: {
                required: 'Please enter your phone number',
                number: 'Phone number must be numeric',
                minlength: 'Phone number must have exactly 10 digits',
                maxlength: 'Phone number must have exactly 10 digits'
            },
            moveInDate: {
                required: 'Please enter the move-in date',
            }
        },
        errorPlacement: function (error, element) {
            if (element.attr('name') === 'phone') {
                error.appendTo($('#phoneError'));
            } else if (element.attr('name') === 'moveInDate') {
                error.appendTo($('#moveInDateError'));
            } else {
                error.insertAfter(element);
            }
        },
        submitHandler: function (form) {
            // Ajax
            alert('Valid form');
        }
    })

})