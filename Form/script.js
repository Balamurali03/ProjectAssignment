function submitForm() {
    const formData = getFormData();
    displayPopup(formData);
    clearForm();
  }
  
  function getFormData() {
    const formData = {};
  
    formData.firstName = document.getElementById('firstName').value;
    formData.lastName = document.getElementById('lastName').value;
    formData.dob = document.getElementById('dob').value;
    formData.country = document.getElementById('country').value;
  
    const genderCheckboxes = document.querySelectorAll('input[name="gender"]:checked');
    formData.gender = Array.from(genderCheckboxes).map(checkbox => checkbox.value).join(', ');
  
    formData.email = document.getElementById('email').value;
    formData.mobileNumber = document.getElementById('mobileNumber').value;
  
    return formData;
  }
  
function displayPopup(formData) {
    const popup = document.getElementById('overlay');
    const popupContent = document.getElementById('formData');
    const isEmpty = Object.values(formData).some(value => value.trim() === '');
  
    popupContent.innerHTML = '';
  
    if (isEmpty) {
      const message = document.createElement('p');
      message.textContent = 'Please fill all the data.';
      popupContent.appendChild(message);
    } else {
      for (const key in formData) {
        if (formData.hasOwnProperty(key)) {
          const label = document.createElement('p');
          label.textContent = `${key.charAt(0).toUpperCase() + key.slice(1)}: ${formData[key]}`;
          popupContent.appendChild(label);
        }
      }
    }
  
    popup.style.display = 'flex';
  }
  
  function closePopup() {
    const popup = document.getElementById('overlay');
    popup.style.display = 'none';
  }
  
  function clearForm() {
    const form = document.getElementById('myForm');
    form.reset();
  }
  