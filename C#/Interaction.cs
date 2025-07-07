using TMPro;
using UnityEngine;
using UnityEngine.UI;


public class Interaction : MonoBehaviour
{
    // Start is called once before the first execution of Update after the MonoBehaviour is created
    public Camera cam;                   // Main Camera
    public Text objectNameText;         // UI Text
    public float rayDistance = 100f;    // Ray 거리
    public LayerMask interactableLayer; // 상호작용 가능한 오브젝트만
    public LayerMask pickableLayer; // 특정 레이어만 선택 가능

    private GameObject heldObject;
    private Vector3 holdOffset;
    // Update is called once per frame
    void Update()
    {
        // 오브젝트 이름 표시
        Ray ray = cam.ScreenPointToRay(Input.mousePosition);
        if (Physics.Raycast(ray, out RaycastHit hitName, rayDistance, interactableLayer))
        {
            objectNameText.text = hitName.collider.gameObject.name;
            objectNameText.enabled = true;
        }
        else
        {
            objectNameText.enabled = false;
        }

        // 마우스 왼쪽 버튼 클릭 시
        if (Input.GetMouseButtonDown(0))
        {
            TryPickObject();
        }

        // 마우스 버튼을 떼면 오브젝트 놓기
        if (Input.GetMouseButtonUp(0))
        {
            DropObject();
        }

        // 오브젝트 들고 있으면 따라오게 하기
        if (heldObject != null)
        {
            MoveHeldObject();
        }
    }

    void TryPickObject()
    {
        Ray ray = cam.ScreenPointToRay(Input.mousePosition);
        if (Physics.Raycast(ray, out RaycastHit hitPick, rayDistance, pickableLayer))
        {
            heldObject = hitPick.collider.gameObject;

            if (heldObject.TryGetComponent<Rigidbody>(out Rigidbody rb))
            {
                rb.useGravity = false;
                rb.velocity = Vector3.zero;
            }

            holdOffset = hitPick.point - heldObject.transform.position;
        }
    }

    void MoveHeldObject()
    {
        Ray ray = cam.ScreenPointToRay(Input.mousePosition);
        Vector3 targetPoint = ray.GetPoint(3f); // 화면 앞쪽 3단위 거리
        heldObject.transform.position = targetPoint - holdOffset;
    }

    void DropObject()
    {
        if (heldObject != null && heldObject.TryGetComponent<Rigidbody>(out Rigidbody rb))
        {
            rb.useGravity = true;
        }

        heldObject = null;
    }

}